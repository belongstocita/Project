#SERVER_1301204122_CITAKAMALIA

import socket
import threading

HEADER = 64
TCP_PORT = 5050
TCP_SERVER = socket.gethostbyname(socket.gethostname())
ADDRESS = (TCP_SERVER, TCP_PORT)
FORMAT = 'utf-8'
DISCONNECT_MESSAGE = "DISCONNECT"

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(ADDRESS)

def handle_client(conn, address):
    print(f"[NEW CONNECTION] {address} connected.")

    connected = True 
    while connected:
        msg_len = conn.recv(HEADER).decode(FORMAT)
        if msg_len:
            msg_len = int(msg_len)
            msg = conn.recv(msg_len).decode(FORMAT)
            if msg == DISCONNECT_MESSAGE:
                connected = False
            
            print(f"[{address}] {msg}")
            conn.send("Msg received".encode(FORMAT))
            
    conn.close()   

def start():
    server.listen()
    print(f"[LISTENING] Server is listening on {TCP_SERVER}")
    while True:
        conn, address = server.accept()
        thread = threading.Thread(target=handle_client, args=(conn, address))
        thread.start()
        print(f"[ACTIVE CONNECTIONS] {threading.activeCount() - 1}")

print("[STARTING] server is starting...")
start()


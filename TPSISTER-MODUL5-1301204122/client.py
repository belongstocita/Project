#CLIENT_1301204181_INDAH PUTRI MAHARANI

import socket

HEADER = 64
TCP_PORT = 5050
FORMAT = 'utf-8'
DISCONNECT_MESSAGE = "DISCONNECT"
TCP_SERVER = "192.168.56.1"
ADDRESS = (TCP_SERVER, TCP_PORT)

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(ADDRESS)

def send(msg):
    message = msg.encode(FORMAT)
    msg_len = len(message)
    send_len = str(msg_len).encode(FORMAT)
    send_len += b' ' * (HEADER - len(send_len))
    client.send(send_len)
    client.send(message)
    print(client.recv(2048).decode(FORMAT))

send(input())
send(input())
send(input())
send(DISCONNECT_MESSAGE)






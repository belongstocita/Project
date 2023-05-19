#TPMOD2 SISTER
#Program menghitung luas bangun datar

#Luas lingkaran
def lingkaran () :
    r = float(input("Masukkan jari - jari lingkaran : "))
    luas = 3.14 * r * r
    print ("Luas lingkaran adalah: ",luas)

#Citakamalia_1301204122

#luas persegi
def persegi () :
    s = int(input("Sisi persegi: "))
    luas = s*s
    print ("Luas persegi adalah: ",luas)

#luas persegi panjang
def persegipanjang () :
    p = int(input("Panjang: "))
    l = int(input("Lebar: "))
    luas = p*l
    print ("Luas persegi panjang adalah: ",luas)

#luas layang-layang
def layang () :
    d1 = int(input("Diagonal 1: "))
    d2 = int(input("Diagonal 2: "))
    luas = (d1*d2)/2
    print ("Luas layang-layang adalah: ",luas)

#Program Utama
loop = True
while loop:
    
    print("Menu Pilihan:")
    print("1. Lingkaran")
    print("2. Persegi")
    print("3. Persegi Panjang")
    print("4. Layang-layang")
    
    #Citakamalia_1301204122
    
    pilih = input("Input : ")
    
    if pilih == ('1'):
        lingkaran()
    elif pilih == ('2'):
        persegi()
    elif pilih == ('3'):
        persegipanjang()
    elif pilih == ('4'):
        layang()
    else :
        print ("Ulangi input. Pilih 1-4")
        loop = False
        














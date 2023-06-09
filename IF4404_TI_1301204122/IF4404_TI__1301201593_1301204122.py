# -*- coding: utf-8 -*-
"""IF4404_TI _1301201593_1301204122

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/15Mf9v-3R7NdiVDKkPUQYCUVKexq_Zhof

Anggota Kelompok
1. Citakamalia  (1301204122)
2. Felix Timothy Pasaribu (1301201593)
"""

!gdown --id 1tJ4xAsuVl8NDZk6PhX11tyH60a8QGJVX

import numpy as np 
import matplotlib.pyplot as plt
import pandas as pd

def importData():
  data = []
  Dataset = pd.read_excel("bengkel.xlsx")
  for i in range(len(Dataset['id'])):
    data.append([])
    data[i].append(Dataset['id'][i])
    data[i].append(Dataset['servis'][i])
    data[i].append(Dataset['harga'][i])
  return data

"""Fungsi Linguistik

Kualitas Servis 
1. Sangat Bagus -> 80 - 100
2. Bagus -> 40 - 75
3. Buruk -> 0 - 30

Price 
1. Murah -> 1 - 3
2. Normal -> 4 - 6
3. Mahal -> 7 - 10
"""

def FuzzyService(NS): 
    Buruk = 0
    #Buruk
    if (NS <= 25):
        Buruk = 1
    elif (NS >= 40): 
        Buruk = 0
    elif (NS < 25 and NS < 40):
        Buruk = (40-NS)/(40-25)

    Bagus = 0
    #Bagus
    if (NS <= 25 or NS >= 80):
        Bagus = 0
    elif (NS >= 40 and NS <= 75):
        Bagus = 1
    elif (NS > 25 and NS < 40):
        Bagus = (NS - 25) / (40 - 25)
    elif (NS > 75 and NS < 80):
        Bagus = (80 - NS) / (80 - 75)
        
    SangatBagus = 0
    #Sangat Bagus
    if (NS <= 75):
        SangatBagus = 0
    elif (NS >= 80 and NS <= 100):
        SangatBagus = 1
    elif (NS > 75 and NS < 80):
        SangatBagus = (NS - 75) / (80 - 75)
    return round(Buruk,3), round(Bagus,3), round(SangatBagus, 3)

def FuzzyPrice(NP): 
    Murah = 0
    #Murah
    if (NP <= 2):
        Murah = 1
    elif (NP > 5):
        Murah = 0
    elif (NP > 2 and NP < 5 ):
        Murah = (5 - NP) / (5 - 2)

    Normal = 0
    #Normal
    if (NP <= 2 or NP >= 7):
        Normal = 0
    elif(NP >= 5 and NP <= 6):
        Normal = 1
    elif(NP > 2 and NP < 5):
        Normal = (NP - 2) / (5 - 2)
    elif(NP > 6 and NP < 7):
        Normal =  (7 - NP) / (7 - 6)

    Mahal = 0
    #Mahal
    if (NP <= 6):
        Mahal = 0
    elif (NP >= 7 and NP <= 10):
        Mahal = 1
    elif (NP  > 6 and NP < 7):
        Mahal = (NP - 6)/(7 - 6)
    return round(Murah,3), round(Normal,3), round(Mahal,3)

def FuzzyRules(service, price): 
  arrRules = [
      ["Jelek", min(service[0], price[0])],
      ["Jelek", min(service[0], price[1])],
      ["Memuaskan", min(service[0], price[2])],
      ["Jelek", min(service[1], price[0])],
      ["Memuaskan", min(service[1], price[1])],
      ["Cukup", min(service[1], price[2])],
      ["Memuaskan", min(service[2], price[0])],
      ["Memuaskan", min(service[2], price[1])],
      ["Cukup", min(service[2], price[2])],
  ]
  rules = [['Cukup', max(arrRules[5][1], arrRules[8][1])], 
           ['Memuaskan', max(arrRules[2][1], arrRules[4][1], arrRules[6][1], arrRules[7][1])], 
           ['Jelek', max(arrRules[0][1], arrRules[1][1], arrRules[3][1])]]
 
  return rules

def Defuzz(value):
  nilai = ((value[0][1] * 100) + (value[1][1] * 60) + (value[2][1]*30))/(value[0][1] + value[1][1] + value[2][1])
  return nilai

result = []
data = importData()
for i in range(len(data)):
  hasil = FuzzyRules(FuzzyService(data[i][1]), FuzzyPrice(data[i][2]))
  x = Defuzz(hasil)
  y = [i+1, x]
  result.append(y)

result.sort(reverse=True ,key= lambda x: x[1])

best10 = result[:50]

best = pd.DataFrame(best10, columns=["ID", "Z Score"])
best.to_excel('peringkat.xlsx', index=False)

peringkat = pd.read_excel("peringkat.xlsx")
peringkat
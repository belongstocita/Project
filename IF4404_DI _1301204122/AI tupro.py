import random
import math

#Kelompok DI
#Citakamalia (1301204122)
#Muhammad Reyfasha Ilhami (1301204461)
#Ruh Devita Widhiana (1301204021)

x1_min = -5
x2_max = 5
y1_min = -5
y2_max = 5

class chromosome:
    def __init__(self, biner = None):
        if biner == None:
            self.biner = random.choices([0, 1], k=10)
        else:
            self.biner = biner
        self.x = self.Representation(x1_min, x2_max, self.biner[:5])
        self.y = self.Representation(y1_min, y2_max, self.biner[5:])

    def __repr__(self):
        return '{} ({}, {}) - {}'.format(self.biner, self.x, self.y, heuristic(self.x, self.y))

    def Representation(self, x1, x2, g):
        tp = [2**-i for i in range(1, len(g) + 1)]
        return x2 + ((x1 - x2) / sum(tp) * sum([g[i] for i in range(len(g))]))

def heuristic(x, y):
    return 1/(((math.cos(x) + math.sin(y))**2) / (x*x + y*y)+ 0.01)

def fitness(x, y):
    return heuristic(x, y)

def exist(a, b):
    found = False
    for i in a:
        if i.biner == b.biner:
            found = True
            break
    return found

def seleksi_ortu(k):
    ortu = []
    list_fitness = list(map(lambda b: fitness(b.x, b.y), population))
    list_weight = [list_fitness[i] / sum(list_fitness) for i in range(len(population))]
    while len(ortu) != k:
        candidate = random.choices(population, weights=list_weight)[0]
        if not exist(ortu, candidate):
            ortu.append(candidate)
    return ortu

def Crossover(ortu1, ortu2):
    position = random.randint(1, len(ortu1.biner) - 2)
    biner_child1 = ortu1.biner[:position] + ortu2.biner[position:]
    biner_child2 = ortu2.biner[:position] + ortu1.biner[position:]

    #Mutasi
    pm = random.uniform(0, 50)
    if pm < 1:
        idx_mutation = random.randint(0, len(biner_child2) - 1)
        if biner_child2[idx_mutation] == 1:
            biner_child2[idx_mutation] = 0
        else:
            biner_child2[idx_mutation] = 1

    population.append(chromosome(biner_child1))
    population.append(chromosome(biner_child2))

def seleksi_survivor():
    population.sort(key=lambda b: heuristic(b.x, b.y), reverse=True)
    while len(population) != 50:
        population.pop()

# main

population = []
generation = 1
while len(population) != 50:
    b = chromosome()
    if not exist(population, b):
        population.append(b)

seleksi_survivor()
print('Generasi', generation)
print('Terbaik', population[0])

arr_fit = [0]*100
arr_fit[generation-1] = fitness(population[0].x, population[0].y)

while generation < 100:
    ortu = seleksi_ortu(2)
    Crossover(ortu[0], ortu[1])
    seleksi_survivor()

    generation += 1

    arr_fit[generation-1] = fitness(population[0].x, population[0].y)
    print('Generasi', generation)
    print('Terbaik', population[0])


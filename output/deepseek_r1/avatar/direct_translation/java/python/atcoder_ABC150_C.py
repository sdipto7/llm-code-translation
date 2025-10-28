import itertools

n = int(input())
p1 = ''.join(input().split())
p2 = ''.join(input().split())

permutations = [''.join(p) for p in itertools.permutations(map(str, range(1, n+1)))]

index1 = permutations.index(p1)
index2 = permutations.index(p2)
print(abs(index1 - index2))

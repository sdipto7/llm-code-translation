
from itertools import permutations

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    line = [""] * 2
    index = 1
    
    for i in range(2):
        for j in range(n):
            line[i] += data[index]
            index += 1
    
    number = ''.join(str(i) for i in range(1, n + 1))
    perm_list = [''.join(p) for p in permutations(number)]
    
    sum_value = 0
    for j in range(2):
        for i, perm in enumerate(perm_list):
            if perm == line[j]:
                if sum_value == 0:
                    sum_value += i
                else:
                    sum_value -= i
    
    print(abs(sum_value))

if __name__ == "__main__":
    main()



from itertools import permutations

def permutation(target, ans):
    return [ans + p for p in permutations(target)]

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    line = ["", ""]
    index = 1
    for i in range(2):
        for j in range(n):
            line[i] += data[index]
            index += 1
    
    number = ''.join(str(i) for i in range(1, n + 1))
    listA = permutation(number, "")
    sum = 0
    
    for j in range(2):
        for i in range(len(listA)):
            if listA[i] == line[j]:
                if sum == 0:
                    sum += i
                else:
                    sum -= i
    
    print(abs(sum))

if __name__ == "__main__":
    main()


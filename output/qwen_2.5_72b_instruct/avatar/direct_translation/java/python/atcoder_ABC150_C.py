
import itertools

def permutation(target):
    return [''.join(p) for p in itertools.permutations(target)]

def main():
    import sys
    input = sys.stdin.read().split()
    n = int(input[0])
    line = [[''.join(input[1:n+1]), ''.join(input[n+1:2*n+1])]]
    number = ''.join(str(i) for i in range(1, n + 1))
    listA = permutation(number)
    sum = 0
    for j in range(2):
        for i in range(len(listA)):
            if listA[i] == line[0][j]:
                if sum == 0:
                    sum += i
                else:
                    sum -= i
    print(abs(sum))

if __name__ == "__main__":
    main()


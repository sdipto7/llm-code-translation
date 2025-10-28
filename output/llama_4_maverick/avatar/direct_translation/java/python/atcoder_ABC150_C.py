
import itertools

def permutation(target):
    return list(itertools.permutations(target))

def main():
    n = int(input())
    line = [''.join(input().split()) for _ in range(2)]
    number = ''.join(str(i) for i in range(1, n + 1))
    listA = [''.join(p) for p in permutation(number)]
    sum = 0
    for j in range(2):
        for i, perm in enumerate(listA):
            if perm == line[j]:
                if sum == 0:
                    sum += i
                else:
                    sum -= i
    print(abs(sum))

if __name__ == "__main__":
    main()


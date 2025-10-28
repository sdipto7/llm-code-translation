
import itertools
import sys

def permutation(target, ans, lst):
    if len(target) <= 1:
        lst.append(ans + target)
    else:
        for i in range(len(target)):
            permutation(target[:i] + target[i+1:], ans + target[i], lst)
    return lst

def main():
    n = int(sys.stdin.readline())
    line = [[""], [""]]
    for i in range(2):
        for j in range(n):
            line[i][0] += sys.stdin.readline().strip()
    number = ''.join(str(i) for i in range(1, n+1))
    listA = []
    permutation(number, "", listA)
    sum_val = 0
    for j in range(len(line)):
        for i in range(len(listA)):
            if listA[i] == line[j][0]:
                if sum_val == 0:
                    sum_val += i
                else:
                    sum_val -= i
    print(abs(sum_val))

if __name__ == "__main__":
    main()


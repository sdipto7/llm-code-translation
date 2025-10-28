
from itertools import permutations

def permutation(list, target, ans):
    if len(target) <= 1:
        list.append(ans + target)
    else:
        for i in range(len(target)):
            permutation(list, target[:i] + target[i+1:], ans + target[i])
    return list

if __name__ == "__main__":
    import sys
    
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    line = [[''], ['']]
    
    index = 1
    for i in range(2):
        line[i][0] = ''.join(data[index:index+n])
        index += n
    
    number = ''.join(str(i) for i in range(1, n+1))
    
    listA = []
    permutation(listA, number, "")
    
    sum_val = 0
    for j in range(len(line)):
        for i in range(len(listA)):
            if listA[i] == line[j][0]:
                if sum_val == 0:
                    sum_val += i
                else:
                    sum_val -= i
    
    print(abs(sum_val))


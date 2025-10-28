
def permutation(lst, target, ans):
    if len(target) <= 1:
        lst.append(ans + target)
    else:
        for i in range(len(target)):
            permutation(lst, target[:i] + target[i+1:], ans + target[i])

def main():
    n = int(input())
    line = []
    for _ in range(2):
        parts = input().split()
        line.append(''.join(parts))
    
    number = ''.join(str(i) for i in range(1, n+1))
    list_a = []
    permutation(list_a, number, "")
    
    sum_val = 0
    for s in line:
        idx = list_a.index(s)
        if sum_val == 0:
            sum_val += idx
        else:
            sum_val -= idx
    
    print(abs(sum_val))

if __name__ == "__main__":
    main()


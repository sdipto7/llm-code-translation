def find(a, b):
    calc = 0
    for x in range(len(a)):
        if a[x] != b[x]:
            calc += 1
    return calc

def main():
    S = input().strip()
    T = input().strip()
    min_val = float('inf')
    for i in range(len(S) - len(T) + 1):
        substring = S[i:i+len(T)]
        result = find(substring, T)
        min_val = min(min_val, result)
    if min_val != float('inf'):
        print(min_val)
    else:
        print(len(T))

if __name__ == "__main__":
    main()

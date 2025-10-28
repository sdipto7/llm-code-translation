
def main():
    S = input().strip()
    T = input().strip()
    min_diff = float('inf')
    for i in range(len(S) - len(T) + 1):
        min_diff = min(min_diff, find(S[i:i+len(T)], T))
    if min_diff != float('inf'):
        print(min_diff)
    else:
        print(len(T))

def find(a, b):
    calc = 0
    for x in range(len(a)):
        if a[x] != b[x]:
            calc += 1
    return calc

if __name__ == "__main__":
    main()


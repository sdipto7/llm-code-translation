
def find(a: str, b: str) -> int:
    calc = 0
    for x in range(len(a)):
        if a[x] != b[x]:
            calc += 1
    return calc

def main():
    import sys
    input = sys.stdin.read
    data = input().splitlines()
    S = data[0]
    T = data[1]
    min_val = float('inf')
    for i in range(len(S) - len(T) + 1):
        min_val = min(min_val, find(S[i:i + len(T)], T))
    
    if min_val != float('inf'):
        print(min_val)
    else:
        print(len(T))

if __name__ == "__main__":
    main()


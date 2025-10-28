
import sys

def main():
    import sys
    S = input().strip()
    T = input().strip()
    min_value = float('inf')
    for i in range(len(S) - len(T) + 1):
        min_value = min(min_value, find(S[i:i+len(T)], T))
    if min_value != float('inf'):
        print(min_value)
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



def main():
    S = input()
    T = input()
    min_diff = float('inf')
    for i in range(len(S) - len(T) + 1):
        current_diff = find(S[i:i+len(T)], T)
        min_diff = min(min_diff, current_diff)
    print(min_diff if min_diff != float('inf') else len(T))

def find(a, b):
    calc = 0
    for i in range(len(a)):
        if a[i] != b[i]:
            calc += 1
    return calc

if __name__ == "__main__":
    main()



def is_even_string(s):
    a = s[:len(s) // 2]
    b = s[len(s) // 2:]
    return a == b

def main():
    import sys
    S = sys.stdin.readline().strip()
    
    if len(S) % 2 == 1:
        S = S[:-1]
    else:
        S = S[:-2]
    
    while S:
        if is_even_string(S):
            break
        S = S[:-2]
    
    print(len(S))

if __name__ == "__main__":
    main()



import sys

def is_even_string(s):
    half_length = len(s) // 2
    a = s[:half_length]
    b = s[half_length:]
    return a == b

def main():
    S = sys.stdin.readline().strip()
    
    if len(S) % 2 == 1:
        S = S[:-1]
    else:
        S = S[:-2]
    
    while len(S) > 0:
        if is_even_string(S):
            break
        else:
            S = S[:-2]
    
    print(len(S))

if __name__ == "__main__":
    main()


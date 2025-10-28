
def is_even_string(s):
    a = s[:len(s)//2]
    b = s[len(s)//2:]
    return a == b

def main():
    S = input().strip()

    if len(S) % 2 == 1:
        S = S[:len(S) - 1]
    else:
        S = S[:len(S) - 2]

    while len(S) > 0:
        if is_even_string(S):
            break
        S = S[:len(S) - 2]

    print(len(S))

if __name__ == "__main__":
    main()


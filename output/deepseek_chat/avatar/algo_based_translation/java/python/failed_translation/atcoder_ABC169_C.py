
def main():
    a = int(input())
    b = input()
    b_char = list(b)
    length = len(b_char)
    b_str = ""
    i = 0
    while i < length:
        if b_char[i] != '.':
            b_str += b_char[i]
        i += 1
    b_int = int(b_str)
    result = (a * b_int) // 100
    print(result)

if __name__ == "__main__":
    main()


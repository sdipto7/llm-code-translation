
def main():
    N = int(input())
    i = 357
    count = 0
    while i <= N:
        s = str(i)
        if '3' in s and '5' in s and '7' in s:
            count += 1
        reversed_s = s[::-1]
        new_digits = []
        f = False
        for ch in reversed_s:
            if f:
                new_digits.append(ch)
            else:
                if ch == '3':
                    new_digits.append('5')
                    f = True
                elif ch == '5':
                    new_digits.append('7')
                    f = True
                elif ch == '7':
                    new_digits.append('3')
        if not f:
            new_digits.append('3')
        new_i_str = ''.join(new_digits[::-1])
        i = int(new_i_str)
    print(count)

if __name__ == "__main__":
    main()


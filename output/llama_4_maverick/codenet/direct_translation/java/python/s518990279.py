
BIG_NUM = 2000000000
MOD = 1000000007

while True:
    try:
        inputed = input().strip()
        if len(inputed) == 1 and inputed == '0':
            break
        ans = sum(int(digit) for digit in inputed)
        print(ans)
    except EOFError:
        break
    except Exception as e:
        print(e)


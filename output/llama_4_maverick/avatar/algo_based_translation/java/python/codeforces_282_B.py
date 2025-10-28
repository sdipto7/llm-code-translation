
def main():
    n = int(input())
    ch = [''] * n
    s1, s2 = 0, 0
    flag, j = 0, 0
    for _ in range(n):
        x, y = map(int, input().split())
        temp1, temp2 = s1 + x, s2 + y
        if abs(temp1 - s2) <= 500:
            s1 += x
            ch[j] = 'A'
            j += 1
        elif abs(temp2 - s1) <= 500:
            s2 += y
            ch[j] = 'G'
            j += 1
        else:
            flag = 1
            break
    if flag == 1:
        print(-1)
    else:
        print(''.join(ch[:j]))

if __name__ == "__main__":
    main()


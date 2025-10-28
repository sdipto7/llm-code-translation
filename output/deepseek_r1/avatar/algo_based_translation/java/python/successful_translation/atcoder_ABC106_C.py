
s = input().strip()
k = int(input())
for i in range(k):
    if s[i] == '1':
        if i == k - 1:
            print(1)
            break
    else:
        print(s[i])
        break


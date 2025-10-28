
str = [input().strip() for _ in range(4)]
yes = 0

for u in range(3):
    for i in range(3):
        case1 = (str[u][i] == str[u][i+1]) and (
            (str[u+1][i] == str[u][i]) or (str[u+1][i+1] == str[u][i])
        )
        case2 = (str[u+1][i] == str[u+1][i+1]) and (
            (str[u][i] == str[u+1][i]) or (str[u][i+1] == str[u+1][i])
        )
        if case1 or case2:
            print("YES")
            yes = 1
            break
    if yes:
        break

if not yes:
    print("NO")


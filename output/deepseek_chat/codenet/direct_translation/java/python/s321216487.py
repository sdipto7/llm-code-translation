
S = input()
for i in range(len(S)):
    for j in range(len(S)):
        begin = S[:i]
        end = S[j:]
        answer = begin + end
        if answer == "keyence":
            print("YES")
            exit()
        elif begin == "keyence":
            print("YES")
            exit()
        elif end == "keyence":
            print("YES")
            exit()
print("NO")


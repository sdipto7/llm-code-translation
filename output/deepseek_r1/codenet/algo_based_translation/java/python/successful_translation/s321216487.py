
import sys

S = input().strip()

for i in range(len(S)):
    for j in range(len(S)):
        begin = S[:i]
        end = S[j:]
        answer = begin + end
        if answer == "keyence":
            print("YES")
            sys.exit()
        elif begin == "keyence":
            print("YES")
            sys.exit()
        elif end == "keyence":
            print("YES")
            sys.exit()

print("NO")


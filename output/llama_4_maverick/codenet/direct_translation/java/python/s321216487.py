
def main():
    S = input().strip()
    for i in range(len(S)):
        for j in range(len(S)):
            begin = S[:i]
            end = S[j:]
            answer = begin + end
            if answer == "keyence" or begin == "keyence" or end == "keyence":
                print("YES")
                return
    print("NO")

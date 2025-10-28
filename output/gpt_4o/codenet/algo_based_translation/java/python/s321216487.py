
def check_keyence_substring():
    import sys
    input = sys.stdin.read
    S = input().strip()

    for i in range(len(S) + 1):
        for j in range(i, len(S) + 1):
            begin = S[:i]
            end = S[j:]
            answer = begin + end

            if answer == "keyence" or begin == "keyence" or end == "keyence":
                print("YES")
                return

    print("NO")

check_keyence_substring()


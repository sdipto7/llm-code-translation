
def main():
    N = int(input())
    string_map = {}
    for i in range(N):
        string_map[i] = input()

    ans = True
    past = {}
    next_str = ""
    for i in range(N):
        if string_map[i] in past.values():
            ans = False
            break
        past[i] = string_map[i]
        if i != 0:
            if not string_map[i].startswith(next_str):
                ans = False
                break
        next_str = string_map[i][-1]

    if ans:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()


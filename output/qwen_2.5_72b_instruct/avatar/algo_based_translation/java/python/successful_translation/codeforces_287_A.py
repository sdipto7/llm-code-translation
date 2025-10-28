
import sys

def main():
    import sys
    from io import StringIO

    input_data = sys.stdin.read().strip().split()
    sc = iter(input_data)
    str = [""] * 4
    i = -1
    while i != 3:
        i += 1
        str[i] = next(sc)
    u = -1
    i = -1
    yes = 0
    while u != 2:
        u += 1
        i = -1
        while i != 2:
            i += 1
            if ((str[u][i] == str[u][i + 1] and (str[u + 1][i] == str[u][i] or str[u + 1][i + 1] == str[u][i])) or
                (str[u + 1][i] == str[u + 1][i + 1] and (str[u][i] == str[u + 1][i] or str[u][i + 1] == str[u + 1][i]))):
                yes = 1
                print("YES")
                break
        if yes == 1:
            break
    if yes == 0:
        print("NO")

if __name__ == "__main__":
    main()


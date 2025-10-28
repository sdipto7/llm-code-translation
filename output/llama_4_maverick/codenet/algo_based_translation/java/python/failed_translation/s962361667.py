
def main():
    w, n = map(int, input().split())
    values = list(range(1, w + 1))
    for _ in range(n):
        str_input = input()
        ab = str_input.split(",")
        a = int(ab[0]) - 1
        b = int(ab[1]) - 1
        x = values[a]
        values[a] = values[b]
        values[b] = x
    for value in values:
        print(value)

if __name__ == "__main__":
    main()


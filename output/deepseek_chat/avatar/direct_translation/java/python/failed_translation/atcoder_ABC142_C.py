
def main():
    import sys
    N = int(sys.stdin.readline())
    id_order = {}
    for i in range(1, N + 1):
        A = int(sys.stdin.readline())
        id_order[A] = i
    for i in range(1, N + 1):
        print(id_order[i], end=" ")

if __name__ == "__main__":
    main()


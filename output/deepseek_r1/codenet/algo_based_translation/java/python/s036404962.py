
def main():
    X, t = map(int, input().split())
    if X >= t:
        print(X - t)
    else:
        print(0)

if __name__ == "__main__":
    main()



def main():
    import sys

    X = int(input())
    t = int(input())

    if X >= t:
        print(X - t)
    elif X < t:
        print(0)

if __name__ == "__main__":
    main()



def main():
    while True:
        number = int(input())
        if number == 0:
            break
        score = [int(input()) for _ in range(number)]
        score.sort()
        total = sum(score[1:-1])
        print(total // (number - 2))

if __name__ == "__main__":
    main()


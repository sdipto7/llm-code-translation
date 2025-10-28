
def main():
    n = int(input())
    ryuka = [0] * (n + 1)
    if n >= 0:
        ryuka[0] = 2
    if n >= 1:
        ryuka[1] = 1
    for i in range(2, n + 1):
        ryuka[i] = ryuka[i - 1] + ryuka[i - 2]
    print(ryuka[n])

if __name__ == "__main__":
    main()


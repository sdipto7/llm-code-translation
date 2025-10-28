
def main():
    x = int(input())
    count = 0
    tmp = x
    x = 0
    while x != 360:
        x = (x + tmp) % 360
        count += 1
    print(count)

if __name__ == "__main__":
    main()


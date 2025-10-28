
class CalArea:
    def area(self, w: int, h: int) -> int:
        area = w * h
        return area

def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    arr = [int(data[i]) for i in range(4)]

    ab = CalArea()
    area1 = ab.area(arr[0], arr[1])
    area2 = ab.area(arr[2], arr[3])

    if area1 > area2:
        print(area1)
    elif area1 < area2:
        print(area2)
    else:
        print(area1)

if __name__ == "__main__":
    main()


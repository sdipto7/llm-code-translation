
import sys

class CalArea:
    def area(self, w, h):
        return w * h

def main():
    arr = []
    for _ in range(4):
        try:
            arr.append(int(sys.stdin.readline().strip()))
        except ValueError:
            print("Invalid input")
            return

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


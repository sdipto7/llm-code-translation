
class calArea:
    def Area(self, w, h):
        return w * h

def main():
    arr = list(map(int, input().split()))[:4]
    ab = calArea()
    area1 = ab.Area(arr[0], arr[1])
    area2 = ab.Area(arr[2], arr[3])
    if area1 > area2:
        print(area1)
    elif area1 < area2:
        print(area2)
    elif area1 == area2:
        print(area1)

if __name__ == "__main__":
    main()


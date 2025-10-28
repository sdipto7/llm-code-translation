
from collections import defaultdict

def main():
    n, k = map(int, input().split())
    person_groups = defaultdict(list)
    for _ in range(k):
        group_info = list(map(int, input().split()))
        d = group_info[0]
        for person in group_info[1:]:
            person_groups[person].append(d)

    count = 0
    for i in range(1, n + 1):
        if i not in person_groups:
            count += 1

    print(count)

if __name__ == "__main__":
    main()


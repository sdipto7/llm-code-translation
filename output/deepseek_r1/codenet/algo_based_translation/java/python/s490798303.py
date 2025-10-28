
import sys
from collections import defaultdict

def main():
    data = list(map(int, sys.stdin.read().split()))
    ptr = 0
    n = data[ptr]
    ptr += 1
    k = data[ptr]
    ptr += 1

    person_groups = defaultdict(list)

    for _ in range(k):
        d = data[ptr]
        ptr += 1
        persons = data[ptr:ptr+d]
        ptr += d
        for person in persons:
            person_groups[person].append(d)
    
    count = 0
    for i in range(1, n+1):
        if i not in person_groups:
            count += 1
    
    print(count)

if __name__ == "__main__":
    main()


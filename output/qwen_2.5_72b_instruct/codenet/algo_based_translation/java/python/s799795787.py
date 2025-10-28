
import sys

def main():
    import sys
    import bisect
    import array
    from collections import deque
    from typing import List
    from functools import reduce
    import math
    import copy
    import bisect
    import heapq
    import itertools
    import operator
    import functools
    import re
    import sys
    import os
    import random
    import string
    import time
    import datetime
    import calendar
    import locale
    import json
    import ast
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    from sys import stdin

    sc = sys.stdin
    n = int(sc.readline().strip())
    array = []
    for i in range(n):
        array.append(sc.readline().strip())
    array.sort()
    a = array[0]
    cnt = 1
    for i in range(n):
        if a != array[i]:
            cnt += 1
        a = array[i]
    print(cnt)

if __name__ == "__main__":
    main()


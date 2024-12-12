# 수 찾기
from typing import Any, Sequence

# 이진 탐색 
def bin_serach(a: Sequence, key: Any) -> int:
    pl = 0
    pr = len(a) - 1

    while True:
        pc = (pl + pr) // 2
        if(a[pc] == key):
            return 1
        elif (a[pc] < key):
            pl = pc + 1
        else:
            pr = pc - 1 
        if pl > pr:
            break
    return 0


N = int(input())
A = [x for x in input().split()]
A.sort()
# A = list(map(int, A))

M = int(input())
m_list = [y for y in (input().split())]
result = [0] * M

for i in range(M):
    result = bin_serach(A, m_list[i])
    print(result)

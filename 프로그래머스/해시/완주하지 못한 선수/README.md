Sorting 해쉬를 사용하여 두 가지의 방법으로 문제를 해결할 수 있다.
해쉬는 key와 value의 조합이다. 마치 전화번호부와 비슷하다.
key는 고유값이기 때문에 중복이 불가하다. 따라서 value값으로 key의 중복을 처리한다.

**map.getOrDefault((player,0)+1) : map에서 player라는 key를 가진 값을 가져와달라. 이전에 없었다면 value를 0으로 하고 거기에 1을 더해 1로 set을 하고 이전에 있었다면 player의 값을 가져와서 value+1이니까 2가 된다.

**map.keySet() // map이 가진 key들을 하나씩 꺼낸다.

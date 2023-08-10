
## <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42576">완주하지 못한 선수</a>

### 문제 설명
<p>수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 <code>participant</code>와 완주한 선수들의 이름이 담긴 배열 <code>completion</code>이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.</p>

 ### 제한사항
<p>마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
</p>

### 입출력 예
  <table>
<th>participant</th>	
    <th>completion</th>	
    <th>return</th>
<tr>
    <td>["leo", "kiki", "eden"]</td>
  <td>["eden", "kiki"]</td>	
  <td>"leo"</td>
</tr>
    <tr>
<td>["marina", "josipa", "nikola", "vinko", "filipa"]</td> 
    <td>["josipa", "filipa", "marina", "nikola"]</td>	
      <td>"vinko"</td>
    </tr>
      <tr>
<td>["mislav", "stanko", "mislav", "ana"]</td>	
        <td>["stanko", "ana", "mislav"]</td>	
        <td>"mislav"</td>
</tr>
  </table>
  
### 입출력 예 설명
<ul>
예제 #1
<li>"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.</li>

예제 #2
<li>"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.</li>

예제 #3
<li>"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.</li>
</ul>

### 문제 해결 과정
<pre>
<ul>
 <li>Sorting 해쉬를 사용하여 두 가지의 방법으로 문제를 해결할 수 있다.</li>
<li>해쉬는 key와 value의 조합이다. 마치 전화번호부와 비슷하다.</li>
<li>key는 고유값이기 때문에 중복이 불가하다. 따라서 value값으로 key의 중복을 처리한다.</li>

-map.put() //hash 초기값 넣기

-map.getOrDefault((player,0)+1) : map에서 player라는 key를 가진 값을 가져와달라. 이전에 없었다면 value를 0으로 하고 거기에 1을 더해 1로 set을 하고 이전에 있었다면 player의 값을 가져와서 value+1이니까 2가 된다.

-hash를 꺼내는 방법

for(String i : map){
    i
 }

-map.get() // key 값을 통해 value 를 불러오거나 수정한다. 

-map.keySet() // map이 가진 key들을 하나씩 꺼낸다.
</pre>

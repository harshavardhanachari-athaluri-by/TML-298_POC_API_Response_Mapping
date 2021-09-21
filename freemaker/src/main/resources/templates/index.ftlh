<style>
table,th,tr,td{
	border: solid 1px
}
</style>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Adress</th>
    </tr>

    <#list users as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.addr}</td>
        </tr>
    </#list>
</table>
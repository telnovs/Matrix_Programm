<#import "common/root.ftl" as common>

<@common.root>
    <#include "./common/navbar.ftl">

    <div class="container">
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Имя матрицы</th>
            </tr>
            </thead>
            <tbody>
            <#list matrices as matrix>
                <tr>
                    <td>${matrix.id}</td>
                    <td>${matrix.name}</td>
                </tr>
            <#else >
                Нет записей
            </#list>
            </tbody>
        </table>
    </div>
</@common.root>
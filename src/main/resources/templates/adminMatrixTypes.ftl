<#import "common/root.ftl" as common>

<@common.root>
    <#include "common/admin-navbar.ftl">

    <div class="row">
        <div class="col-md-2">
            <nav class="nav flex-column">
                <a class="nav-link active" href="/admin/matrices/types">Типы матриц</a>
                <a class="nav-link" href="#">Матрицы</a>
                <a class="nav-link" href="#">Пользователи</a>
            </nav>
        </div>

        <div class="col-md-10 themed-grid-col">
            <div class="row justify-content-between align-items-baseline pr-4 pl-4">
                <h4>Типы матриц</h4>
                <a class="nav-link" href="/admin/matrices/types/create">
                    <i class="material-icons h2 text-success">
                        add_circle
                    </i>
                </a>
            </div>

            <table class="table table-striped table-hover">
                <thead>
                <tr>
                    <th scope="col">Имя</th>
                    <th scope="col"></th>
                </tr>
                </thead>
                <tbody>
                <#list matrixTypeList as type>
                    <tr>
                        <td>${type.name}</td>
                        <td>
                            <a href="/admin/matrices/types/${type.id}">
                                <i class="material-icons">
                                    edit
                                </i>
                            </a>
                        </td>
                    </tr>
                <#else >
                    Нет записей
                </#list>
                </tbody>
            </table>
        </div>
    </div>
</@common.root>
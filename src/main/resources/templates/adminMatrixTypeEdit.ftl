<#import "common/root.ftl" as common>

<@common.root>
    <#include "common/admin-navbar.ftl">

    <div class="row pt-5">
        <div class="col-md-2">
            <nav class="nav flex-column">
                <a class="nav-link active" href="/admin/matrices/types">Типы матриц</a>
                <a class="nav-link" href="#">Матрицы</a>
                <a class="nav-link" href="#">Пользователи</a>
            </nav>
        </div>

        <div class="col-md-10">
            <div class="col-md-12">
                <p class="h4">Редактирование типа </p>
            </div>
            <form action="/admin/matrices/types/${matrixType.id}" method="post" class="pt-3">
                <div class="form-group col-md-4">
                    <label for="name">Наименование</label>
                    <input type="text" class="form-control" name="name" id="name" value="${matrixType.name}"/>
                </div>

                <div class="col-md-4 text-right">
                    <button type="submit" class="btn btn-primary">Сохранить</button>
                </div>
            </form>
            <#if message?hasContent>
                <div class="col-md-4 pt-3">
                    <div class="alert alert-danger" role="alert">
                        ${message}
                    </div>
                </div>
            </#if>
        </div>
    </div>
</@common.root>
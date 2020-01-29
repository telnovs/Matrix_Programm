<#import "common/root.ftl" as common>

<@common.root>
    <#include "./common/navbar.ftl">

    <div class="container">
    <div class="row mb-3">
    	<div class="col-md-4 themed-grid-col">
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Имя матрицы</th>
                <th scope="col">&nbsp;</th>
            </tr>
            </thead>
            <tbody>
            <#list matrices as matrix>
                <tr>
                    <td>${matrix.id}</td>
                    <td>${matrix.type.getName()} (${matrix.getSize()}) - ${matrix.getNumber()}</td>
                    <td><button onclick="window.location.href = '/newbake/${matrix.id}';">Выпечь!</button></td>
                </tr>
            <#else >
                Нет записей
            </#list>
            </tbody>
        </table>
        </div>
        <div class="col-md-8 themed-grid-col">
        	<table class="table table-striped table-hover">
            <thead>
            <tr>
                <th scope="col">Дата</th>
                <th scope="col">Матрица</th>
                <th scope="col">Время 1</th>
                <th scope="col">Время 2</th>
                <th scope="col">Результат</th>
                <th scope="col">Номер в 1С</th>
            </tr>
            </thead>
            <tbody>
            <#list bakedFrames as bakedFrame>
                <tr>
                    <td>${bakedFrame.timestamp}</td>
                    <td>${bakedFrame.matrix.type.getName()} (${bakedFrame.matrix.getSize()}) - ${bakedFrame.matrix.getNumber()}</td>
                    <td>${bakedFrame.bakingTime1}</td>
                    <td><#if bakedFrame.bakingTime2??>${bakedFrame.bakingTime2}</#if></td>
                    <td>${bakedFrame.success?string('ОК', 'брак')}</td>
                    <td>&nbsp;</td>
                </tr>
            <#else >
                Нет записей
            </#list>
            </tbody>
        	</table>
        </div>
    </div>
    </div>
</@common.root>
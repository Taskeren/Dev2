# Development2

## 简介
Development2 简称 Dev2，是由 Taskeren(nitu2003) 开发的信息查询工具类模组。

## 使用协议
全模组使用 [CoFH "Don't Be a Jerk" License](https://github.com/nitu2003/Dev2/blob/master/LICENSE.md) 授权使用。

## 模组内容

### 物品信息显示
![](http://attachment.mcbbs.net/forum/201904/07/013011tiw1fnww85jm83wj.png)  
#### 支持类型
1. 注册名称（Registry Name）
1. 未本地化名称（Unlocalized Name / TranslationKey）
1. 矿物辞典（OreDictionary）
1. 食物信息：饥饿值（Amount），饱和度（Saturation），是否是狼的食物（isWolfFavorite）
1. 唱片信息：唱片名称（Local Record Name），唱片音效注册名称（Sound Registry Name），唱片音效未本地话名称（Sound Unlocalized Name）

### 头颅操作系统
![](http://attachment.mcbbs.net/forum/201904/07/014250yaawimmid2wc82dl.png)

#### 设置头颅数据
手持头颅时，可以使用 `/skull` 对头颅信息进行修改。*部分头颅信息数据非常长，请将[头颅码]()添加到 config>advanced>skullsInTab 中，在创造栏取用。*
```
/skull <正版用户ID> // 将头颅的皮肤切换到该正版用户
/skull <头颅UUID> <头颅贴图信息> // 设置头颅贴图
```

#### 获取头颅数据
手持头颅时，按下`Y`键获取头颅的头颅码。

#### 头颅码
头颅码是本模组的一种头颅数据存储格式，默认为`头颅UUID|头颅贴图信息`或`头颅UUID|头颅贴图信息|头颅自定义名称`格式。  
```
// 从 Hypixel 爬下来的部分头颅数据
b1551baa-8928-4966-a071-d170ea4fdc4c|eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjNiNzEwYjA4YjUyM2JiYTdlZmJhMDdjNjI5YmEwODk1YWQ2MTEyNmQyNmM4NmJlYjM4NDU2MDNhOTc0MjZjIn19fQ==|§e?
d876e550-6ea4-43e5-9a47-f69d97278603|eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0OTJmZmY1M2M0N2I1ZWMzODhhYWVlNTZhZGE3ZjRjNjBiNjU1NzZiNDE2MWQ2NmY1M2I1ZTYzMDE3YmQifX19|§e!
```

### 矿典查询系统
![](http://attachment.mcbbs.net/forum/201904/07/014208zws0zupaqauxa36w.png)

#### 查询物品包含的矿典
手持物品，使用`/oredict inhand`命令查询。

#### 查询特殊矿典名称包含物品
使用`/oredict search <查询名称> [是否启用强制匹配]`来搜索。  
**强制匹配**即必须完全匹配，关闭则列出所有矿典包含查询名称的物品。

### 样式代码查询
![](http://attachment.mcbbs.net/forum/201904/07/014144u2nqqpp2e0qfnyt0.png)

#### 获取样式代码列表
使用`/color`命令获取样式代码列表。

#### 预览包含样式代码的字符串
使用`/color <包含样式代码的字符串>`来预览。*因为游戏中无法输入`§`，所以`&`代替`§`。*
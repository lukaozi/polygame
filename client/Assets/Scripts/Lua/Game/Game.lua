---
--- Generated by EmmyLua(https://github.com/EmmyLua)
--- Created by Yuk.
--- DateTime: 2021/7/12 1:25
---
---
require("Game.Libs.Util.class")

---@class Game:Object
local _M = singleton("Game")

---@param self Game
---@return Game
function _M.New(self)
    --BaseObject = require("Game.Libs.Module.BaseObject")
    print("hello word")
    coroutine.start(self.CoInit, self)
end

function _M:CoInit()
    
end

return _M:New()